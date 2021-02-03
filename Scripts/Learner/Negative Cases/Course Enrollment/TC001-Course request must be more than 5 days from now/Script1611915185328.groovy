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

'User click "Course" on the side menu'
WebUI.click(findTestObject('Learner/Side Menu/Courses'))

'User click button "Next"'
WebUI.click(findTestObject('Learner/Courses/Pagination without param/button_NextNext'))

WebUI.delay(2)

'User click "Course" to user employee learner view course details'
WebUI.click(findTestObject('Learner/Request For Enrollment/Course/Course Test/negative test/div_10 YouTube Marketing Strategies That Make Me 6-Figures'))

'User click button "Request For Enrollment" to submit the course to management'
WebUI.click(findTestObject('Learner/Request For Enrollment/button_Request For Enrollment'))

'User input date from : \'26/01/2021\''
WebUI.setText(findTestObject('Learner/Request For Enrollment/input__dateFrom'), '26/01/2021')

'User input date to : \'27/01/2021\' '
WebUI.setText(findTestObject('Learner/Request For Enrollment/input_To_dateTo'), '27/01/2021')

'User click "Motivation"  to choose the motivation or reason for the employee to take the course'
WebUI.click(findTestObject('Learner/Request For Enrollment/Motivation/div_Motivation'))

'User click "Certification" if motivation user employee learner for certification'
WebUI.click(findTestObject('Learner/Request For Enrollment/Motivation/div_Certification'))

'User input text description motivation : \'Want to increase knowledge and certification\' '
WebUI.setText(findTestObject('Learner/Request For Enrollment/textarea__motivationDescription'), 'Want to increase knowledge and certification')

'Default "My Deposit" '
WebUI.click(findTestObject('Learner/Request For Enrollment/label_My Deposit'))

'User click button "Submit" '
WebUI.click(findTestObject('Learner/Request For Enrollment/button_Submit'))

'View alert  ● Course request must be more than 5 days from now'
WebUI.delay(2)

'User click button "x" to close alert'
WebUI.click(findTestObject('Learner/Request For Enrollment/Failed Enrollment/button_close'))

'Users Logout'
WebUI.callTestCase(findTestCase('CustomKeyword In TestCase/Users Logout'), [:], FailureHandling.OPTIONAL)

