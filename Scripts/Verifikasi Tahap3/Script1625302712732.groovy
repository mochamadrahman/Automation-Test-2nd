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

WebUI.comment('+--------------Verifikasi Tahap3-----------------+')

'Nama Bank'
WebUI.click(findTestObject('Verifikasi Tahap3/List_Button_Nama Bank'))

WebUI.delay(2)

WebUI.setText(findTestObject('Verifikasi Tahap3/Input_Field_Nama Bank'), 'bca')

WebUI.delay(2)

WebUI.click(findTestObject('Verifikasi Tahap3/a_BANK CENTRAL ASIA (BCA)'))

'Nomor Rekening'
WebUI.setText(findTestObject('Verifikasi Tahap3/input_Nomor Rekening_bankAccount.ownerAccount'), GlobalVariable.AccountNo)

WebUI.delay(3)

WebUI.click(findTestObject('Verifikasi Tahap3/b_potensi resiko'))

WebUI.delay(3)

WebUI.click(findTestObject('Verifikasi Tahap3/button_Saya Mengerti'))

WebUI.delay(3)

WebUI.click(findTestObject('Verifikasi Tahap3/b_komitmen keanggotaan'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Verifikasi Tahap3/h4_Komitmen Keanggotaan'), 30)

WebUI.delay(3)

CustomKeywords.'com.canvas.scroll.Click'('//div[@id=\'konten-keanggotaan\']/canvas[19]', 0, 502)

WebUI.delay(3)

WebUI.click(findTestObject('Verifikasi Tahap3/Button_Saya_Mengerti_Konten Keanggotaan'))

WebUI.delay(3)

WebUI.click(findTestObject('Verifikasi Tahap3/a_Simpan Data Sementara'))

WebUI.delay(3)

WebUI.click(findTestObject('Verifikasi Tahap3/a_Daftar'))

WebUI.delay(2)

WebUI.click(findTestObject('Verifikasi Tahap3/button_OK'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Verifikasi Tahap3/h4_Perubahan Data Anda SudahKami Terima'), 30)

WebUI.waitForElementVisible(findTestObject('Verifikasi Tahap3/button_Kembali Ke Dashboard'), 30)

WebUI.click(findTestObject('Verifikasi Tahap3/button_Kembali Ke Dashboard'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Verifikasi Tahap3/Status_Account_Menunggu Verifikasi'), 3)

WebUI.click(findTestObject('Verifikasi Tahap3/Menu_Setting'))

WebUI.delay(2)

WebUI.click(findTestObject('Verifikasi Tahap3/Button_Keluar'))

WebUI.delay(5)

WebUI.closeBrowser()

