import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.refresh()

'User Employee Input Password'
WebUI.setText(findTestObject('Login/input_Login_password'), username)

'User Employee Input Username'
WebUI.setText(findTestObject('Login/input_Login_username'), password)

'User Employee Click "Login"'
WebUI.click(findTestObject('Login/button_Login'))

'Users view a text element to verify the menu sebagai learner'
WebUI.verifyElementText(findTestObject('Management/Side Menu/Verify menu sebagai learner/Timeline'), 'Timeline')

'Users view a text element to verify the menu sebagai learner'
WebUI.verifyElementText(findTestObject('Management/Side Menu/Verify menu sebagai learner/Profile'), 'Profile')

'Users view a text element to verify the menu sebagai learner'
WebUI.verifyElementText(findTestObject('Management/Side Menu/Verify menu sebagai learner/Courses'), 'Courses')

'User Employee Click "Logout"'
WebUI.click(findTestObject('Login/button_logout'))

