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

'Users view a text element to verify the username "Admintest Learner"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_username'), 'Admintest Learner')

'Users view a text element to verify the nik "0002"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_nik'), '0002')

'User click "Course" to user employee learner view a list of courses'
WebUI.click(findTestObject('Learner/Side Menu/Courses'))

'User click "Order by" '
WebUI.click(findTestObject('Learner/Courses/sort by/Page_Learn Aja/div_Order by'))

'User click "Lowest Price" to see list course sort by lowest price'
WebUI.click(findTestObject('Learner/Courses/sort by/Page_Learn Aja/div_Lowest Price'))

'User click "Lowest Price" to change sort by'
WebUI.click(findTestObject('Learner/Courses/sort by/Page_Learn Aja/div_Lowest Price'))

'User click "Highest Price" to see list course sort by highest price'
WebUI.click(findTestObject('Learner/Courses/sort by/div_Highest Price'))

'User click button "Reset"'
WebUI.click(findTestObject('Learner/Courses/Search/button_Reset'))

WebUI.delay(2)

WebUI.refresh()

