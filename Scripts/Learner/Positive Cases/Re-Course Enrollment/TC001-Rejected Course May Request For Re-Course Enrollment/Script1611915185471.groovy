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

'Login as User Employee Learner'
WebUI.callTestCase(findTestCase('Login/Positive Cases/TC001-Make Sure User Employee Learner Can Login'), [:], FailureHandling.STOP_ON_FAILURE)

'The user employee view a text element to verify the username "Admintest Learner"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_username'), 'Admintest Learner')

'The user employee view a text element to verify the nik "0002"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_nik'), '0002')

WebUI.click(findTestObject('Learner/Side Menu/Profile'))

WebUI.click(findTestObject('Learner/Menu Profile/My Course'))

WebUI.click(findTestObject('Learner/My course/div_Rejected'))

WebUI.click(findTestObject('Learner/Rejected Course Enrollment/div_Azure DevOps Boards for Project'))

WebUI.verifyElementText(findTestObject('Learner/Rejected Course Enrollment/span_course does not suit position'), 
    'course does not suit position')

WebUI.click(findTestObject('Learner/Rejected Course Enrollment/button_Rejected'))

WebUI.verifyElementText(findTestObject('Learner/Request For Enrollment/Enrollment of Rejected Courses/span_Azure DevOps Boards for Project ManagersAnalystDevelopers'), 
    'Azure DevOps Boards for Project Managers/Analyst/Developers')

WebUI.verifyElementText(findTestObject('Learner/Request For Enrollment/Enrollment of Rejected Courses/div_reason'), 
    'course does not suit position')

WebUI.verifyElementText(findTestObject('Learner/Request For Enrollment/Enrollment of Rejected Courses/div_description of rejection'), 
    'course does not suit position')

WebUI.click(findTestObject('Learner/Request For Enrollment/Enrollment of Rejected Courses/img_back button'))

'User employee click button "Request For Enrollment" to submit the course to management'
WebUI.click(findTestObject('Learner/Request For Enrollment/button_Request For Enrollment'))

