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

'Login Sebagai User Employee Admin'
WebUI.callTestCase(findTestCase('Login/Positive Cases/TC004-Make Sure User Employee Admin Can Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Click "Approval"'
WebUI.click(findTestObject('Admin/Approve or Reject New Course/div_Approval'))

'Click "Admin"'
WebUI.click(findTestObject('Admin/Approve or Reject New Course/div_Admin'))

'Click "New Course Yang Akan Di Approve" untuk menampilkan detail new course'
WebUI.click(findTestObject('Admin/Approve or Reject New Course/List New Course/div_Propose Date November 23 2020AdmintestD_d3380b'))

'Click Button "Approve" jika new course akan di approve '
WebUI.click(findTestObject('Admin/Approve or Reject New Course/button_Approve'))

'Click Button "Yes" untuk menyimpan dan mengirimkan notify ke employee learner'
WebUI.click(findTestObject('Admin/Approve or Reject New Course/a_Yes'))

'Click "Oke" berhasil menyimpan'
WebUI.click(findTestObject('Admin/Approve or Reject New Course/a_Ok'))

WebUI.delay(5)

