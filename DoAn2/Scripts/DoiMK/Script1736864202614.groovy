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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.charleskeith.vn/vn')

WebUI.click(findTestObject('Object Repository/Page_CHARLES  KEITH Vit Nam - Mua sm ti tra_8dff37/span_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_CHARLES  KEITH Vit Nam - Mua sm ti tra_8dff37/input_ia chi email_loginEmail'), 
    'linhsong1909@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CHARLES  KEITH Vit Nam - Mua sm ti tra_8dff37/input_Mt khu_loginPassword'), 
    'P7iB9LQ+1DKZHiXoo/2eYg==')

WebUI.click(findTestObject('Object Repository/Page_CHARLES  KEITH Vit Nam - Mua sm ti tra_8dff37/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Page_CHARLES  KEITH Vit Nam - Mua sm ti tra_8dff37/span_Thng tin'))

WebUI.click(findTestObject('Object Repository/Page_H s ca ti - CHARLES  KEITH VN/button_Thay i mt khu'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_H s ca ti - CHARLES  KEITH VN/input_Mt khu hin ti_dwfrm_profile_login_cur_d361d9'), 
    MkCu)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_H s ca ti - CHARLES  KEITH VN/input_Mt khu mi_dwfrm_profile_login_newpass_d9e315'), 
    MKMoi)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_H s ca ti - CHARLES  KEITH VN/input_Xc nhn mt khu mi_dwfrm_profile_login__e0807e'), 
    XNMKMoi)

WebUI.click(findTestObject('Object Repository/Page_H s ca ti - CHARLES  KEITH VN/button_Thay i mt khu_1'))

