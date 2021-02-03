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

'Login User Employee as Learner'
WebUI.callTestCase(findTestCase('CustomKeyword In TestCase/Login User Employee as Learner'), [:], FailureHandling.OPTIONAL)

'Users view a text element to verify the username "Admintest Learner"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_username'), 'Admintest Learner')

'Users view a text element to verify the nik "0002"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_nik'), '0002')

'User click "Course" to user employee learner view a list of courses'
WebUI.click(findTestObject('Learner/Side Menu/Courses'))

'User click button "Next"'
WebUI.click(findTestObject('Learner/Courses/Pagination without param/button_NextNext'))

WebUI.delay(2)

'User click "Course" to user employee learner view course details'
WebUI.click(findTestObject('Learner/Request For Enrollment/Course/div_10 Things Every Production SQL Server Should Have'))

'Users view a text element to verify the course name "10 Things Every Production SQL Server Should Have"'
WebUI.verifyElementText(findTestObject('Learner/Request For Enrollment/Course/span_10 Things Every Production SQL Server Should Have'), 
    '10 Things Every Production SQL Server Should Have')

'Users view a text element to verify the course credit "279.000"'
WebUI.verifyElementText(findTestObject('Learner/Request For Enrollment/Course/span_279000'), '279.000')

'User click button "Request For Enrollment" to submit the course to management'
WebUI.click(findTestObject('Learner/Request For Enrollment/button_Request For Enrollment'))

'User input date from : \'03/02/2021\' '
WebUI.setText(findTestObject('Learner/Request For Enrollment/input__dateFrom'), '03/02/2021')

'User input date to : \'04/02/2021\' '
WebUI.setText(findTestObject('Learner/Request For Enrollment/input_To_dateTo'), '04/02/2021')

'User click "Motivation"  to choose the motivation or reason for the employee to take the course'
WebUI.click(findTestObject('Learner/Request For Enrollment/Motivation/div_Motivation'))

'User click "Certification" if motivation user employee learner for certification'
WebUI.click(findTestObject('Learner/Request For Enrollment/Motivation/div_Certification'))

'User input text description motivation : \'Want to increase knowledge and certification\' '
WebUI.setText(findTestObject('Learner/Request For Enrollment/textarea__motivationDescription'), 'Want to increase knowledge and certification')

'Default "My Deposit" '
WebUI.click(findTestObject('Learner/Request For Enrollment/label_My Deposit'))

'User click button "Submit" to save the course submission data and send a notify to management'
WebUI.click(findTestObject('Learner/Request For Enrollment/button_Submit'))

'View Pop Up Congratulation / Success Save Data'
WebUI.delay(2)

'Users  view a text element to verify succes request for enrollment course "Congratulation"'
WebUI.verifyElementText(findTestObject('Learner/Request For Enrollment/Succes Request For Enrollment/Congratulation'), 'Congratulation!')

'Users view a text element to verify succes save data "Data saved!"'
WebUI.verifyElementText(findTestObject('Learner/Request For Enrollment/Succes Request For Enrollment/Data saved'), 'Data saved!')

'Click "Ok"'
WebUI.click(findTestObject('Learner/Request For Enrollment/Succes Request For Enrollment/a_Ok'))

'Users view a text element to verify status request course  "Waiting for Approval"'
WebUI.verifyElementText(findTestObject('Learner/Request For Enrollment/Succes Request For Enrollment/Page_Learn Aja/button_Waiting for Approval'), 
    'Waiting for Approval')

'Users Logout\r\n'
WebUI.callTestCase(findTestCase('CustomKeyword In TestCase/Users Logout'), [:], FailureHandling.OPTIONAL)

