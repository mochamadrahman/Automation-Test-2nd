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


WebUI.comment('+--------------Verifikasi Tahap1-----------------+')

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Verifikasi Tahap1/LengkapiProfil'), 30)

WebUI.click(findTestObject('Verifikasi Tahap1/LengkapiProfil'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Verifikasi Tahap1/WNI'), 5)

'Tipe Akun'
WebUI.click(findTestObject('Verifikasi Tahap1/WNI'))

WebUI.delay(3)

WebUI.click(findTestObject('Verifikasi Tahap1/Element_Individual WNI'))

WebUI.click(findTestObject('Verifikasi Tahap1/button_Nama Lengkap Sesuai ID_btn btn-outli_33e7b4'))

'Gelar Nama'
WebUI.click(findTestObject('Verifikasi Tahap1/a_Bpk'))

WebUI.click(findTestObject('Verifikasi Tahap1/label_Laki-laki'))

WebUI.scrollToPosition(0, 250)

'Tempat Lahir'
WebUI.click(findTestObject('Verifikasi Tahap1/List_Button_Tempat Lahir'))

WebUI.setText(findTestObject('Verifikasi Tahap1/TexField_Tempat Lahir'), 'bandung')

WebUI.click(findTestObject('Verifikasi Tahap1/a_Kota Bandung'))

'Tanggal Lahir'
WebUI.click(findTestObject('Verifikasi Tahap1/Kolom_Tanggal Lahir'))

WebUI.click(findTestObject('Verifikasi Tahap1/div_2004'))

WebUI.click(findTestObject('Verifikasi Tahap1/i_keyboard_arrow_up'))

WebUI.click(findTestObject('Verifikasi Tahap1/i_keyboard_arrow_up'))

WebUI.click(findTestObject('Verifikasi Tahap1/i_keyboard_arrow_up'))

WebUI.click(findTestObject('Verifikasi Tahap1/div_1980'))

WebUI.click(findTestObject('Verifikasi Tahap1/button_Pilih'))

'Agama'
WebUI.click(findTestObject('Verifikasi Tahap1/List_Button_Agama'))

WebUI.click(findTestObject('Verifikasi Tahap1/a_Islam'))

WebUI.setText(findTestObject('Verifikasi Tahap1/input_Nama Ibu Kandung_user.rdlMotherMaidenName'), 
    'Djuariah')

WebUI.scrollToPosition(0, 150)

'Status Pernikahan'
WebUI.click(findTestObject('Verifikasi Tahap1/List_Button_Status Pernikahan'))

WebUI.click(findTestObject('Verifikasi Tahap1/a_Menikah'))

'Pendidikan Terakhir'
WebUI.click(findTestObject('Verifikasi Tahap1/List_Button_Pendidikan Terakhir'))

WebUI.click(findTestObject('Verifikasi Tahap1/a_S1'))

WebUI.setText(findTestObject('Verifikasi Tahap1/textarea_Alamat_user.address'), 'Cibubur Country')

WebUI.setText(findTestObject('Verifikasi Tahap1/input_No. RT_user.rdlAddressRt'), '004')

WebUI.setText(findTestObject('Verifikasi Tahap1/input_No. RW_user.rdlAddressRw'), '023')

'Kabupaten / Kota'
WebUI.click(findTestObject('Verifikasi Tahap1/List_Button_Kabupaten Kota'))

WebUI.setText(findTestObject('Verifikasi Tahap1/input_Tidak ada yang dipilih_form-control'), 'bogor')

WebUI.delay(1)

WebUI.click(findTestObject('Verifikasi Tahap1/span_Kab. Bogor'))

'Kecamatan'
WebUI.click(findTestObject('Verifikasi Tahap1/List_Button_Kecamatan'))

WebUI.click(findTestObject('Verifikasi Tahap1/a_Gunung Putri'))

'Kelurahan'
WebUI.click(findTestObject('Verifikasi Tahap1/List_Button_Kelurahan'))

WebUI.click(findTestObject('Verifikasi Tahap1/span_Cikeas Udik'))

WebUI.scrollToElement(findTestObject('Verifikasi Tahap1/label_Informasi Pekerjaan'), 
    1)

'Pekerjaan'
WebUI.click(findTestObject('Verifikasi Tahap1/List_Button_Pekerjaan'))

WebUI.click(findTestObject('Verifikasi Tahap1/a_Pegawai Swasta'))

'Bidang Pekerjaan'
WebUI.click(findTestObject('Verifikasi Tahap1/List_Button_Bidang Pekerjaan'))

WebUI.click(findTestObject('Verifikasi Tahap1/a_Bank'))

'Penghasilan Bulanan'
WebUI.click(findTestObject('Verifikasi Tahap1/List_Button_Penghasilan Bulanan'))

WebUI.click(findTestObject('Verifikasi Tahap1/span_10 - 20 juta rupiah'))

'Sumber Dana'
WebUI.click(findTestObject('Verifikasi Tahap1/List_Button_Sumber Dana'))

WebUI.click(findTestObject('Verifikasi Tahap1/a_Gaji'))

WebUI.setText(findTestObject('Verifikasi Tahap1/input_Nama Kontak Darurat_user.emergencyPhoneName'), 
    'Deti Darwati')

'No Handphone Kontak Darurat'
WebUI.setText(findTestObject('Verifikasi Tahap1/Input_Handphone Kontak Darurat'), GlobalVariable.HandphoneNoDarurat)

WebUI.scrollToElement(findTestObject('Verifikasi Tahap1/Button_Simpan Data Sementara'), 1)

WebUI.click(findTestObject('Verifikasi Tahap1/Button_Simpan Data Sementara'))

WebUI.click(findTestObject('Verifikasi Tahap1/span_Lanjutkan Tahap 2'))