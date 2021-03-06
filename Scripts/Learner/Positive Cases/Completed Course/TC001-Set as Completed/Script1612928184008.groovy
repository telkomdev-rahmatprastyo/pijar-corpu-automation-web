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

'Users Login as Learner'
WebUI.callTestCase(findTestCase('CustomKeyword In TestCase/Login User Employee as Learner'), [:], FailureHandling.STOP_ON_FAILURE)

'Users view a text element to verify the username "Admintest Learner"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_username'), 'Admintest Learner')

'Users view a text element to verify the nik "0002"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_nik'), '0002')

'Users view a text element to verify the name atasan "ADMINTEST_ATASAN"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/span_name atasan'), 'ADMINTEST_ATASAN')

'User Learner click "Profile" on the side menu'
WebUI.click(findTestObject('Learner/Menu Profile/Profile'))

'User Learner click "My Course" to see a list of courses that are On Going, Pending, Rejected, or Finished'
WebUI.click(findTestObject('Learner/Menu Profile/My Course'))

'User Learner Click "Course" : GDPR - in a nutshell'
WebUI.click(findTestObject('Learner/My course/Completed Course/Course 3/div_GDPR - in a nutshell'))

'Users view a text element to verify the title of the course "GDPR - in a nutshell"'
WebUI.verifyElementText(findTestObject('Learner/My course/Completed Course/Course 3/span_GDPR - in a nutshell'), 'GDPR - in a nutshell')

'User Learner view "Upload Certificate" button but can\'t click it'
WebUI.verifyElementNotClickable(findTestObject('Learner/My course/Completed Course/button_Upload Certificate'))

'User Learner view "Set As Complete" button and able to click it'
WebUI.verifyElementClickable(findTestObject('Learner/My course/Completed Course/button_Set as Completed'))

'Click "Set As Complete" button to mark the course was completed'
WebUI.click(findTestObject('Learner/My course/Completed Course/button_Set as Completed'))

'Users view a text element "Congratulations!" on the success pop up'
WebUI.verifyElementText(findTestObject('Learner/My course/Completed Course/h2_Congratulation'), 'Congratulation!')

'Users view a text element "Success!" on the success pop up'
WebUI.verifyElementText(findTestObject('Learner/My course/Completed Course/div_Success'), 'Success!')

'Click "Ok" Button on success pop up, it will shown the detail of the course after being completed'
WebUI.click(findTestObject('Learner/My course/Completed Course/a_Ok'))

'Button "Set As Completed" change to "Completed" and disable to click'
WebUI.verifyElementText(findTestObject('Learner/My course/Completed Course/div_Completed'), 'Completed')

'User Learner view "Upload Certificate" button and able to click it'
WebUI.verifyElementClickable(findTestObject('Learner/My course/Completed Course/button_Upload Certificate'))

