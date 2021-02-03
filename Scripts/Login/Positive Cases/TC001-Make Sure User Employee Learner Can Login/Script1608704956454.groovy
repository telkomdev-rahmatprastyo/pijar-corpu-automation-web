import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.refresh()

'User Employee Input Password'
WebUI.setText(findTestObject('Login/input_Login_password'), GlobalVariable.passwordEmployeeLearner)

'User Employee Input Username'
WebUI.setText(findTestObject('Login/input_Login_username'), GlobalVariable.nikEmployeeLearner)

'User Employee Click "Login"'
WebUI.click(findTestObject('Login/button_Login'))

'The user employee view a text element to verify the username "Admintest Learner"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_username'), 'Admintest Learner')

'The user employee view a text element to verify the nik "0002"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_nik'), '0002')

'The user employee view a text element to verify the superordinate info "ADMINTEST_ATASAN"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/span_name atasan'), 'ADMINTEST_ATASAN')

WebUI.delay(2)

'User Employee Click "Logout"'
WebUI.click(findTestObject('Login/button_logout'))

