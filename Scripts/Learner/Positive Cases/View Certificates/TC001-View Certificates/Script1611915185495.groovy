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

'Users view a text element to verify the username "Admintest Learner"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_username'), 'Admintest Learner')

'Users view a text element to verify the nik "0002"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_nik'), '0002')

'User click "Profile" on the side menu'
WebUI.click(findTestObject('Learner/Side Menu/Profile'))

'User click "My Course" to see a list of courses that are On Going, Pending, Rejected, or Finished'
WebUI.click(findTestObject('Learner/Menu Profile/My Course'))

'User click "Course" : 3D Programming with JavaScript and the Three.js 3D Library'
WebUI.click(findTestObject('Learner/Upload Certificate/Course/div_3D Programming with JavaScript and the Threejs 3D Library'))

'Users view a text element to verify status certificate "Waiting For Approval"'
WebUI.verifyElementText(findTestObject('Learner/View Certificates/label_Waiting For Approval'), 'Waiting For Approval')

'User click button "View Certificate"'
WebUI.click(findTestObject('Learner/View Certificates/button_View Certificate'))

'Users view a text element to verify certificate category "completion"'
WebUI.verifyElementText(findTestObject('Learner/View Certificates/div_completion'), 'completion')

'The user clicks the certificate file to download the certificate'
WebUI.click(findTestObject('Learner/View Certificates/a_0002_completion_1611075794312pdf'))

'User click button "Cancel"'
WebUI.click(findTestObject('Learner/View Certificates/button_Cancel'))

