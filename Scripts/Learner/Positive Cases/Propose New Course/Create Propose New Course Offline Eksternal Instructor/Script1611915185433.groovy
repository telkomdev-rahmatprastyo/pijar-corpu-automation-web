import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Login Sebagai User Employee Learner'
WebUI.callTestCase(findTestCase('Login/Positive Cases/TC001-Make Sure User Employee Learner Can Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Click "Course" untuk menampilkan list course'
WebUI.click(findTestObject('Learner/Side Menu/Courses'))

'Click Button "Propose New Course" untuk menampilkan form propose new course'
WebUI.click(findTestObject('null'))

'Click Image "Course Image" untuk upload Image'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/img__new-course-image-upload'), FailureHandling.STOP_ON_FAILURE)

'Input Course Name : \'Test Course Offline 2\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/input__courseName'), 'Test Course Offline 2')

'Click "Select Category" untuk memilih category course'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Category Course/div_Select Category'))

'Click "Data Dan Analisis" untuk pilihan category course yang berhubungan dengan Data dan Analisis'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Category Course/div_Data dan Analisis'))

'Input Tanggal Mulai Course : \'01/12/2020\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Time/input_Start Date_dateFrom'), '01/12/2020')

'Input Tanggal Selesai Course : \'02/03/2021\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Time/input_End Date_dateTo'), '02/03/2021')

'Click "Selected Estimated Time" untuk menentukan perkiraan waktu course dalam Jam, Hari , atau Bulan'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Time/div_Select Estimated Time'))

'Click "Months" jika perkiraan waktu course untuk beberapa bulan'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Time/div_Months'))

'Input Value Estimated Time : \'3\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Time/input_estimatedTimeValue'), '3')

'Click "Select Price Type" untuk menentukan course tersebut berbayar atau gratis'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Price/div_Select Price Type'))

'Click "Paid" jika course berbayar'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Price/div_Paid'))

'Input Payment Course : \'305000\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Price/input_Paid_paymentValue'), '305000')

'Click / Checklist "Offline" jika Course Offline'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Course Type/Offline/label_Offline'))

'Input Lokasi Tempat Course : \'Cemara 2\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Course Type/Offline/input__location'), 'cemara 2')

'Input Contact Person Course : \'082322222222\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Course Type/Offline/input__contactPerson'), '082322222222')

'Click "Select Provider" untuk melilih provider course'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Provider/div_Select Provider'))

'Click "Other" jika provider course yang ingin di pilih belum ada'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Provider/div_Other'))

'Input Provider Name : \'Arkademy\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Provider/input_Other_providerValue'), 'Arkademy')

'Click "Select Level" untuk memilih level course'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Level/div_Select Level'))

'Click "Advance" jika level course untuk advance'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Level/div_Advance'))

'Input Description : \'descripsi offline course internal instructor\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/textarea__description'), 'descripsi offline course internal instructor')

'Input Curriculum : \'test\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/textarea_Curriculum_curriculum'), 'test')

'Click "Select Skill Sets" untuk memilih skill course dan bisa lebih dari satu skill'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Skill Sets/div_Select Skill Sets'))

'Click "A/B Testing" jika A/B Testing merupakan skill pada course tersebut'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Skill Sets/div_AB Testing'))

'Click "Instructor" untuk memilih istructor internal atau eksternal'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Eksternal Instructor/div_Internal'))

'Click "Internal" jika instructor dari internal'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Eksternal Instructor/div_External'))

'Input Name Instructor : \'Dodi\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Eksternal Instructor/input__name'), 'Dodi')

'Input Position Instructor : \'dev\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Eksternal Instructor/input__position'), 'dev')

'Click "Upload File" jika ingin mengupload image instructor'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Eksternal Instructor/div_Upload File'), FailureHandling.STOP_ON_FAILURE)

'Click "Submit" menyimpan new course dan mengirimkan notify new course ke corpu'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/button_Submit'))

WebUI.delay(5)

