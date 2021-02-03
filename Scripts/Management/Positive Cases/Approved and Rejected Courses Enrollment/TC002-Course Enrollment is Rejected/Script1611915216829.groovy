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

'Users view a text element to verify the username "Admintest Atasan"'
WebUI.verifyElementText(findTestObject('Management/Dashboard/b_username'), 'Admintest Atasan')

'Users view a text element to verify the nik "0001"'
WebUI.verifyElementText(findTestObject('Management/Dashboard/b_nik'), '0001')

'User click "Approval" on the side menu'
WebUI.click(findTestObject('Management/Side Menu/Approval'))

'User click "Management" on the side menu'
WebUI.click(findTestObject('Management/Side Menu/Management'))

'User click "Course Request" to see the course request list'
WebUI.click(findTestObject('Management/Management Menu/div_Course Request'))

'User click "Course" to see the request details and course details'
WebUI.click(findTestObject('Management/Course Request/Request Course 2/div_NET 5 Web API  Entity Framework Crash Course'))

'Users view a text element to verify the course category "Web Development"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 2/span_Web Development'), 
    'Web Development')

'Users view a text element to verify the course name to reject course ".NET 5 Web API & Entity Framework Crash Course"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 2/span_NET 5 Web API  Entity Framework Crash Course'), 
    '.NET 5 Web API & Entity Framework Crash Course')

'Users view text element to verify nik employee requesting course "0002"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 2/div_0002'), '0002')

'Users view text element to verify username employee requesting course "Admintest Learner"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 2/div_Admintest Learner'), 
    'Admintest Learner')

'Users display text element to verify payment "My Deposit"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 2/label_My Deposit'), 'My Deposit')

'Users view text element to verify credit course "599.000"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 2/h2_559000-credit course'), 
    '559.000')

'Users view text element to verify credit deposit employee "Credit 10.000.000"'
WebUI.verifyElementText(findTestObject('Management/Course Request/Request Course 2/span_Credit 10000000-credit deposit employee'), 
    'Credit 10.000.000')

'User click button "Reject"  to rejected course request'
WebUI.click(findTestObject('Management/Approve or Reject Course/button_Reject'))

'User click "Select Reason" to display some existing reject reasons'
WebUI.click(findTestObject('Management/Approve or Reject Course/div_Select Reason'))

'Users click "Course Does Not Suit Position" to select that reason'
WebUI.click(findTestObject('Management/Approve or Reject Course/div_course does not suit position'))

'Users input deskripsi reason : \'course does not suit position\''
WebUI.setText(findTestObject('Management/Approve or Reject Course/textarea_course does not suit position_reason'), 
    'course does not suit position')

'User click "Submit" to save the rejected course data and send a notify to employee learner'
WebUI.click(findTestObject('Management/Approve or Reject Course/a_Submit'))

'Users view a text element to verify succes rejected course'
WebUI.verifyElementText(findTestObject('Management/Approve or Reject Course/Succes Rejected/h2_Congratulation'), 
    'Congratulation!')

'Users view a text element to verify succes rejected course "Enrollment RequestRejected"'
WebUI.verifyElementText(findTestObject('Management/Approve or Reject Course/Succes Rejected/div_Enrollment RequestRejected'), 
    'Enrollment RequestRejected')

'User click button "Ok"'
WebUI.click(findTestObject('Management/Approve or Reject Course/Succes Rejected/a_Ok'))

