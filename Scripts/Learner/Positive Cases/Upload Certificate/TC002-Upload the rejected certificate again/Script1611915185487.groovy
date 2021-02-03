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

WebUI.click(findTestObject('Learner/Side Menu/Profile'))

WebUI.click(findTestObject('Learner/Menu Profile/My Course'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Learner/Upload Certificate/button_Reupload Certificate'))

WebUI.click(findTestObject('Learner/Upload Certificate/span_PDF only with maximum size 500kb_btn-t_a78c33'))

WebUI.click(findTestObject('Learner/Upload Certificate/button_Change File'))

WebUI.click(findTestObject('Learner/Upload Certificate/div_Choose Certificate FilePDF only with ma_42c0ab'))

