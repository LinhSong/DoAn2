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

WebUI.click(findTestObject('Object Repository/Page_CHARLES  KEITH Vit Nam - Mua sm ti tra_8dff37/a_To ti khon'))

WebUI.setText(findTestObject('Object Repository/Page_To ti khon khch hng mi - CHARLES  KEITH VN/input_Tn_dwfrm_profileWithMandatoryFields_c_d3d8a8'), 
    Ten)

WebUI.setText(findTestObject('Object Repository/Page_To ti khon khch hng mi - CHARLES  KEITH VN/input_H_dwfrm_profileWithMandatoryFields_cu_397aa1'), 
    Ho)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_To ti khon khch hng mi - CHARLES  KEITH VN/select_Nm                                  _a9c160'), 
    NamSinh, false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_To ti khon khch hng mi - CHARLES  KEITH VN/select_MM                                  _a45802'), 
    Thang, false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_To ti khon khch hng mi - CHARLES  KEITH VN/select_DD                                  _7e7113'), 
    Ngay, false)

WebUI.setText(findTestObject('Object Repository/Page_To ti khon khch hng mi - CHARLES  KEITH VN/input_S lin lc_dwfrm_profileWithMandatoryFi_d63274'), 
    SDT)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_To ti khon khch hng mi - CHARLES  KEITH VN/select_N                                   _c889eb'), 
    GT, false)

WebUI.setText(findTestObject('Object Repository/Page_To ti khon khch hng mi - CHARLES  KEITH VN/input_ia chi email_dwfrm_profileWithMandato_066250'), 
    Email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_To ti khon khch hng mi - CHARLES  KEITH VN/input_Mt khu_dwfrm_profileWithMandatoryFiel_fe59f3'), 
    Mk)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_To ti khon khch hng mi - CHARLES  KEITH VN/select_La chn                              _2cfcc4'), 
    Chon, false)

WebUI.click(findTestObject('Object Repository/Page_To ti khon khch hng mi - CHARLES  KEITH VN/label_Gi cho ti b su tp mi ca CHARLES  KEIT_914840_1'))

WebUI.click(findTestObject('Object Repository/Page_To ti khon khch hng mi - CHARLES  KEITH VN/label_Ti ng  vi iu khon  iu kin v Chnh sch _0fa76c'))

WebUI.click(findTestObject('Object Repository/Page_To ti khon khch hng mi - CHARLES  KEITH VN/button_To ti khon'))

WebUI.closeBrowser()

