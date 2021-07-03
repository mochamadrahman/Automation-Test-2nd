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

String Angka = new SimpleDateFormat('yyyyMMddHHmmss').format(Calendar.getInstance().getTime())

String emailLogin = ('testalamisharia+' + Angka) + '@gmail.com'

GlobalVariable.emailLogin = emailLogin

println(emailLogin)

String Phone = new SimpleDateFormat('MMddHHmmss').format(Calendar.getInstance().getTime())

String HandphoneNo = '08' + Phone

GlobalVariable.HandphoneNo = HandphoneNo

SimpleDateFormat sdf = new SimpleDateFormat('MMddHHmmss')

Calendar c = Calendar.getInstance()

c.setTime(new Date())

c.add(Calendar.MONTH, 2 //Adds years
    )

String Phone1 = sdf.format(c.getTime())

String HandphoneNoDarurat = '08' + Phone1

GlobalVariable.HandphoneNoDarurat = HandphoneNoDarurat

WebUI.comment('+------------Registrasi-----------------+')

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Registrasi/Element_Daftar Disini'))

WebUI.click(findTestObject('Registrasi/Pemberi Dana'))

WebUI.setText(findTestObject('Registrasi/input_Nama Lengkap_name'), GlobalVariable.Nama)

WebUI.delay(2)

WebUI.setText(findTestObject('Registrasi/input_Email_email'), GlobalVariable.emailLogin)

WebUI.setText(findTestObject('Registrasi/input_No. Handphone_phone'), GlobalVariable.HandphoneNo)

WebUI.setEncryptedText(findTestObject('Registrasi/input_Password_password'), 'obHRUPsWjWX6hwpQ4JW4rg==')

WebUI.click(findTestObject('Registrasi/label_Individual'))

WebUI.scrollToElement(findTestObject('Registrasi/select_-- Silahkan Pilih --                _9f24ad'), 
    2)

WebUI.click(findTestObject('Registrasi/select_-- Silahkan Pilih --                _9f24ad'))

WebUI.selectOptionByValue(findTestObject('Registrasi/select_-- Silahkan Pilih --                _9f24ad'), 
    '3', true)

WebUI.click(findTestObject('Registrasi/select_-- Silahkan Pilih --                _9f24ad'))

WebUI.verifyElementPresent(findTestObject('Registrasi/button_Lanjutkan'), 2)

WebUI.click(findTestObject('Registrasi/button_Lanjutkan'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Registrasi/h5_Kebijakan Privasi  Ketentuan Pengguna'), 
    1)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Registrasi/h5_KONTAK DAN MEDIA SOSIAL ALAMI'), 
    5)

WebUI.click(findTestObject('Registrasi/input_Saya tertarik update info terbaru ALA_1ed3da'))

WebUI.click(findTestObject('Registrasi/input_Saya sudah membaca dan setuju dengan._c5cbb7'))

WebUI.click(findTestObject('Registrasi/button_Lanjutkan_1'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Registrasi/Silahkan klik link aktivasi'), 
    1)

WebUI.verifyElementPresent(findTestObject('Registrasi/Kirim Ulang Aktivasi Email'), 
    1)

WebUI.openBrowser(GlobalVariable.gmailAddress)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Registrasi/Email_Address_Field'), GlobalVariable.emailID)

WebUI.click(findTestObject('Registrasi/Button_Berikutnya'))

WebUI.delay(5)

WebUI.click(findTestObject('Registrasi/Element_Password'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Registrasi/Element_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Registrasi/Button_Berikutnya'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Registrasi/Email_Alami'), 30)

WebUI.click(findTestObject('Registrasi/Email_Alami'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Registrasi/Button_Aktivasi_Email'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Registrasi/Button_Aktivasi_Email'))

'close tab gmail'
WebUI.closeWindowIndex(0)

WebUI.switchToWindowUrl(GlobalVariable.successRegister)

WebUI.verifyElementPresent(findTestObject('Registrasi/Element_Alhamdulillah'), 1)

WebUI.delay(2)

WebUI.closeBrowser()

