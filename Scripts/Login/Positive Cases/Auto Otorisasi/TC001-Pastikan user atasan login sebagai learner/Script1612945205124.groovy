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

'User Employee Input Username'
WebUI.setText(findTestObject('Login/input_Login_username'), GlobalVariable.nikEmployeeManagement)

'User Employee Input Password'
WebUI.setText(findTestObject('Login/input_Login_password'), GlobalVariable.passwordEmployeeManagement)

'User Employee Click "Login"'
WebUI.click(findTestObject('Login/button_Login'))

'Users view a text element to verify the username "Admintest Learner"'
WebUI.verifyElementText(findTestObject('Management/Dashboard/b_username'), 'Admintest Atasan')

'Users view a text element to verify the nik "0002"'
WebUI.verifyElementText(findTestObject('Management/Dashboard/b_nik'), '0001')

'Users view a text element to verify the superordinate info "BANG JAGO"'
WebUI.verifyElementText(findTestObject('Management/Dashboard/span_name atasan'), 'BANG JAGO')

WebUI.delay(2)

'Users view a text element to verify the menu sebagai learner'
WebUI.verifyElementText(findTestObject('Learner/Side Menu/Verify menu sebagai learner/Timeline'), 'Timeline')

'Users view a text element to verify the menu sebagai learner'
WebUI.verifyElementText(findTestObject('Learner/Side Menu/Verify menu sebagai learner/Profile'), 'Profil')

'Users view a text element to verify the menu sebagai learner'
WebUI.verifyElementText(findTestObject('Learner/Side Menu/Verify menu sebagai learner/Courses'), 'Course')

'User Employee Click "Logout"'
WebUI.click(findTestObject('Login/button_logout'))

