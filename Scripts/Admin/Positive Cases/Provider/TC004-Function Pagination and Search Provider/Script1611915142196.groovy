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

'User employee click "Provider" on the side menu'
WebUI.click(findTestObject('Admin/Side Menu/div_Provider'))

'User employee click pagination number 2 '
WebUI.click(findTestObject('Admin/Provider/pagination/button_2'))

'User employee click button "Previous"'
WebUI.click(findTestObject('Admin/Provider/pagination/button_PreviousPrevious'))

'User employee click button "Next"'
WebUI.click(findTestObject('Admin/Provider/pagination/button_NextNext'))

'User employee click button "First"'
WebUI.click(findTestObject('Admin/Provider/pagination/button_First'))

'User employee click button "Last"'
WebUI.click(findTestObject('Admin/Provider/pagination/button_Last'))

'User Employee click "Order By"'
WebUI.click(findTestObject('Admin/Provider/div_Order by'))

'User employee click "name" for list provider order by name'
WebUI.click(findTestObject('Admin/Provider/Page_Learn Aja/div_Name'))

'User employee input text search provider "udemy"'
WebUI.setText(findTestObject('Admin/Provider/input_Name_searchText'), 'udemy')

'User employee click button "Search"'
WebUI.click(findTestObject('Admin/Provider/button_Search'))

