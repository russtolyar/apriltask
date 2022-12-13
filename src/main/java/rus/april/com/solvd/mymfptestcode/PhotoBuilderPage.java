//package rus.april.com.solvd.mymfptestcode;
//
//import java.util.List;
//
//public class PhotoBuilderPage {
//
//
//    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='ProgressPhotosGalleryActivity']/android.widget.FrameLayout/" +
//            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview." +
//            "widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout")
//    private List<ExtendedWebElement> entitiesList;
//
//    @FindBy(id = "com.myfitnesspal.android:id/import_text")
//    private ExtendedWebElement textCTA;
//
//    @Override
//    public int getCountOfEntries() {
//        return entitiesList.size();
//    }
//
//    @Override
//    public WebElement getEntryByIndex(int index) {
//        return entitiesList.get(index).getElement();
//    }
//
//    @Override
//    public boolean isEntryPresent(int index) {
//        return entitiesList.get(index).isElementPresent(TWO_SEC_TIMEOUT);
//    }
//
//    @Override
//    public boolean isEntryWithDatePresent(int index) {
//        return getEntryByIndex(index).getAttribute("resource-id").equals("com.myfitnesspal.android:id/date_month_day");
//    }
//
//    @Override
//    public boolean isEntryImage(int index) {
//        return entitiesList.get(index).getAttribute("class").equals("android.widget.ImageView");
//    }
//
//    @Override
//    public boolean isCTAImportPhotoPresent() {
//        return textCTA.isElementPresent(TWO_SEC_TIMEOUT);
//    }
//
//    @Override
//    public boolean isNoPhotoEntryHasDate() {
//        for( ExtendedWebElement element : entitiesList){
//            if(!element.getAttribute("class").equals("android.widget.ImageView")){
//                return element.getAttribute("resource-id").equals("com.myfitnesspal.android:id/date_month_day");
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public void tapOnWeightEntry (int index) {
//        entitiesList.get(index).clickIfPresent();
//    }
//
//
//}