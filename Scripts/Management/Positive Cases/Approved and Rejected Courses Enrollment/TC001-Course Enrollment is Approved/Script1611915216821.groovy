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

'Login as User Employee Management'
WebUI.callTestCase(findTestCase('Login/Positive Cases/TC002-Make Sure User Employee Management Can Login'), [:], FailureHandling.STOP_ON_FAILURE)

'The user view a text element to verify the username "Admintest Atasan"'
WebUI.verifyElementText(findTestObject('Management/Dashboard/b_username'), 'Admintest Atasan')

'The user view a text element to verify the nik "0001"'
WebUI.verifyElementText(findTestObject('Management/Dashboard/b_nik'), '0001')

'User click "Approval" on the side menu'
WebUI.click(findTestObject('Management/Side Menu/Approval'))

'User click "Management" on the side menu'
WebUI.click(findTestObject('Management/Side Menu/Management'))

'User click "Course Request" to see the course request list'
WebUI.click(findTestObject('Management/Management Menu/div_Course Request'))

'User click "Course" to see the request details and course details'
WebUI.click(findTestObject('Management/Course Request/Request Course 1/div_2020 Practice Test AWS Solutions Architect Associate SAA C02'))

'Users view a text element to verify the course category "IT Certifications"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 1/span_IT Certifications'), 
    'IT Certifications')

'Users view a text element to verify the course name to approve course "2020 Practice Test AWS Solutions Architect Associate SAA C02"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 1/span_2020 Practice Test AWS Solutions Architect Associate SAA C02'), 
    '2020 Practice Test AWS Solutions Architect Associate SAA C02')

'Users view text element to verify nik employee requesting course "0002"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 1/div_0002'), '0002')

'Users view text element to verify username employee requesting course "Admintest Learner"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 1/div_Admintest Learner'), 
    'Admintest Learner')

'Users display text element to verify payment "My Deposit"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 1/label_My Deposit'), 'My Deposit')

'Users view text element to verify credit course "0"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 1/h2_0-credit course'), '0')

'Users view text element to verify credit deposit employee "Credit 10.000.000"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 1/span_Credit 10000000-credit deposit employee'), 
    'Credit 10.000.000')

'User click button "Approve"  to approved course request'
WebUI.click(findTestObject('Management/Approve or Reject Course/button_Approve'))

'Users view a text element to verify "Are you sure to approve this request?"'
WebUI.verifyElementText(findTestObject('Management/Approve or Reject Course/Succes Approved/div_Are you sure to approve this request'), 
    'Are you sure to approve this request?')

'User click "Yes" to save the approved course data and send a notify to employee learner'
WebUI.click(findTestObject('Management/Approve or Reject Course/Succes Approved/a_Yes'))

'Users view a text element to verify succes approved course'
WebUI.verifyElementText(findTestObject('Management/Approve or Reject Course/Succes Approved/h2_Congratulation'), 
    'Congratulation!')

'Users view a text element to verify succes approved course "Success Approve"'
WebUI.verifyElementText(findTestObject('Management/Approve or Reject Course/Succes Approved/div_Success Approve'), 
    'Success Approve')

'User click button "Ok"'
WebUI.click(findTestObject('Management/Approve or Reject Course/Succes Approved/a_Ok'))

