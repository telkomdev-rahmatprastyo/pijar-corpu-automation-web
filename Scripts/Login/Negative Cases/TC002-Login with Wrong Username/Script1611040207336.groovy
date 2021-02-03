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

'Go To URL Learn Aja '
WebUI.navigateToUrl(GlobalVariable.BASEURL)

'User employee input username : "9999"'
WebUI.setText(findTestObject('Login/input_Login_username'), '9999')

'User employee input password : "password.0002"'
WebUI.setEncryptedText(findTestObject('Login/input_Login_password'), '8SQVv/p9jVSEptS6IDVV9w==')

'User employee click "Login"'
WebUI.click(findTestObject('Login/button_Login'))

'The user employee view the text element verify "User Not Found"'
WebUI.verifyElementText(findTestObject('Login/div_User Not Found'), 'User Not Found')

'User employee click button "Dismiss" to login again'
WebUI.click(findTestObject('Login/a_Dismiss'))

