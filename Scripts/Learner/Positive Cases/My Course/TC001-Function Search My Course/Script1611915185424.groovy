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

WebUI.callTestCase(findTestCase('Login/Positive Cases/TC001-Make Sure User Employee Learner Can Login'), [:], FailureHandling.STOP_ON_FAILURE)

'The user employee view a text element to verify the username "Admintest Learner"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_username'), 'Admintest Learner')

'The user employee view a text element to verify the nik "0002"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_nik'), '0002')

'User employee click "Profile" on the side menu'
WebUI.click(findTestObject('Learner/Side Menu/Profile'))

'User employee click "My Course" to see a list of courses that are On Going, Pending, Rejected, or Finished'
WebUI.click(findTestObject('Learner/Menu Profile/My Course'))

'Filter by "Finished", Employee users click "Finished" or "v" if want to change the search filter'
WebUI.click(findTestObject('Learner/My course/Function Search My Course/Filter Search My Course/div_Finished'))

'User employee clicks "On Going" if the course you are looking for status is complete or uncompleted'
WebUI.click(findTestObject('Learner/My course/Function Search My Course/Filter Search My Course/div_On Going'))

'User input text search my course : \'API\' '
WebUI.setText(findTestObject('Learner/My course/Function Search My Course/input_search my course'), 
    'API')

'User employee click button "Search" to display the desired course result'
WebUI.click(findTestObject('Learner/My course/Function Search My Course/button_Search'))

WebUI.delay(5)

'User employee click button "Reset" , if you want to delete and reset the search'
WebUI.click(findTestObject('Learner/My course/Function Search My Course/button_Reset Search My Course'))

WebUI.delay(5)

WebUI.closeBrowser()

