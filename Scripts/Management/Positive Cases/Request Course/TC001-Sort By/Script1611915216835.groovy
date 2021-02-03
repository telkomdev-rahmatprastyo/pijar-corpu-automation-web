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

'User click "Select Sort By"'
WebUI.click(findTestObject('Management/Course Request/Sort By/div_Select Sort By_css-1w6opou-indicatorContainer'))

'User click sory by "Oldest Propose Date"'
WebUI.click(findTestObject('Management/Course Request/Sort By/div_Oldest Propose Date'))

'User click button "Reset"'
WebUI.click(findTestObject('Management/Course Request/Sort By/button_Reset'))

'User click button "Upgrade Skill"'
WebUI.click(findTestObject('Management/Course Request/Sort By/button_Upgrade Skill'))

'User click button "Reset"'
WebUI.click(findTestObject('Management/Course Request/Sort By/button_Reset'))

'User click button "Certification"'
WebUI.click(findTestObject('Management/Course Request/Sort By/button_Certification'))

'User click button "Reset"'
WebUI.click(findTestObject('Management/Course Request/Sort By/button_Reset'))

'User click button "Carrer"'
WebUI.click(findTestObject('Management/Course Request/Sort By/button_Career'))

'User click button "Reset"'
WebUI.click(findTestObject('Management/Course Request/Sort By/button_Reset'))

'User click "Select Sort By"'
WebUI.click(findTestObject('Management/Course Request/Sort By/div_Select Sort By_css-1w6opou-indicatorContainer'))

'User click sory by "Oldest Propose Date"'
WebUI.click(findTestObject('Management/Course Request/Sort By/div_Oldest Propose Date'))

'User click button "Upgrade Skill"'
WebUI.click(findTestObject('Management/Course Request/Sort By/button_Upgrade Skill'))

'User click button "Certification"'
WebUI.click(findTestObject('Management/Course Request/Sort By/button_Certification'))

'User click button "Carrer"'
WebUI.click(findTestObject('Management/Course Request/Sort By/button_Career'))

'User click button "Reset"'
WebUI.click(findTestObject('Management/Course Request/Sort By/button_Reset'))

