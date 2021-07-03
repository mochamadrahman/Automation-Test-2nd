import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint


WebUI.comment('+--------------Verifikasi Tahap2-----------------+')

'Nomor ktp'
WebUI.setText(findTestObject('Verifikasi Tahap2/input_Nomor e-KTP_verification.ktpNumber'), 
    GlobalVariable.KTPNo)

WebUI.click(findTestObject('Verifikasi Tahap2/label_e-KTP berlaku seumur hidup'))

'Kota penerbit ktp'
WebUI.click(findTestObject('Verifikasi Tahap2/List_Button_Kota Penerbit KTP'))

WebUI.delay(3)

WebUI.setText(findTestObject('Verifikasi Tahap2/Input_Field_Kota Penerbit KTP'), 'bogor')

WebUI.delay(1)

WebUI.click(findTestObject('Verifikasi Tahap2/Verifikasi2_Kota_Penerbit KTP'))

'NPWP'
WebUI.setText(findTestObject('Verifikasi Tahap2/input_Nomor NPWP_verification.npwpNumber'), 
    GlobalVariable.NPWPNo)

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Verifikasi Tahap2/input_Upload Foto e-KTP_ktpDocumentId'), 
    GlobalVariable.ktp)

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Verifikasi Tahap2/input_Upload Foto NPWP_npwpDocumentId'), 
    GlobalVariable.npwp)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Verifikasi Tahap2/span_Simpan Data Sementara'), 
    3)

WebUI.delay(3)

WebUI.click(findTestObject('Verifikasi Tahap2/span_photo_camera'))

WebUI.delay(3)

WebUI.click(findTestObject('Verifikasi Tahap2/button_Ambil Foto'))

WebUI.delay(3)

WebUI.click(findTestObject('Verifikasi Tahap2/a_Simpan Data Sementara'))

WebUI.delay(3)

WebUI.click(findTestObject('Verifikasi Tahap2/span_Lanjutkan Tahap 3'))