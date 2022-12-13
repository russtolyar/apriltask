//package rus.april.com.solvd.mymfptestcode;
//
//public class ProgressAdsAndBannersTest {
//    @TestRailCases(testCasesId = "12800", suiteId = "93, 92")
//    @Test(description = "Check the Flow")
////    @TestTag(name = "feature", value = "Premium CTA banner - Progress Screen. Рrogress Screen")
//    @TestTag(name = "feature", value = "Android galery")
//    @MethodOwner(owner = "vrudyk", platform = "android")
//    public void flowTest() {
//
//        MFPCommonPageBase mfpCommonPageBase = initPage(getDriver(), MFPCommonPageBase.class);
//        mfpCommonPageBase.switchToRollout(RolloutItems.NEW_DASHBOARD, RolloutVariantSwitches.ON, false);
//        authService.login(authService.readUser("android_dashboard_premium_user"));
//
////        Account account = AccountFactory.generateAccount();
////        initPage(getDriver(), CreateAccountPageBase.class).fastAccountCreation(account);
//
//        DashboardPageBase dashboardPage = initPage(getDriver(), DashboardPageBase.class);
//
//        MoreBottomMenuPageBase moreBottomMenuPage = (MoreBottomMenuPageBase) dashboardPage.openBottomMenuItem(DashboardBottomMenuItems.MORE);
//        GoalsPageBase goalsPage = (GoalsPageBase) moreBottomMenuPage.openMenuItem(MoreMenuItems.GOALS);
//        int goalWeight = (int) goalsPage.getGoalWeight();
//        int currentWeight = (int) goalsPage.getCurrentWeight();
//        int startingWeight = (int) goalsPage.getStartingWeight();
//        goalsPage.clickBackButton();
//        dashboardPage = (DashboardPageBase) dashboardPage.openBottomMenuItem(DashboardBottomMenuItems.DASHBOARD);
//
//        ProgressPageBase progressPage = dashboardPage.clickOnModuleByName(DashboardProgressModule.WEIGHT);
//        int entriesOnProgressPage = progressPage.getCountOfEntries();
//        int settingWeight = Math.round((goalWeight + startingWeight) / 2);
//
////        initPage(getDriver(), MFPCommonPageBase.class).switchToRollout(RolloutItems.PROGRESS_PREMIUM_BANNER, RolloutVariantSwitches.PROGRESS_BANNER_LOGGING, false);
////        authService.login(authService.readUser(NON_TRIAL_ANDROID_USER));
////        NavigationBarBase navBar = initPage(getDriver(), NavigationBarBase.class);
////        ProgressPageBase progressPage = (ProgressPageBase) navBar.openMore().openMenuItem(MoreMenuItems.PROGRESS);
//
//        AddWeightPageBase addWeightPage = progressPage.clickAddWeightButton();
//
////        CongratulationsPageBase congratulationsPage = addWeightPage.setWeight(75).clickSaveButton();
////         progressPage =
//
//        CongratulationsPageBase congratulationsPage = addWeightPage.setWeight(settingWeight).clickSaveButton();
//        PhotoBuilderPageBase photoBuilderPage = congratulationsPage.clickShareBtn();
//
////         PhotoBuilderPageBase photoBuilderPage = progressPage.clickShareButton();
////         PhotoBuilderPageBase photoBuilderPage = initPage(getDriver(),PhotoBuilderPageBase.class);
//
//        int entriesInPhotoCarousel = photoBuilderPage.getCountOfEntries();
//        Assert.assertTrue(entriesOnProgressPage == entriesInPhotoCarousel, "[PHOTOBUILDERPAGE screen] NO All entries are shown in carousel");
//        WebElement progressEntry =  photoBuilderPage.getEntryByIndex(1);
//        Assert.assertTrue(photoBuilderPage.isEntryPresent(1),"[PROGRESS screen] NO entries present");
//
////        Assert.assertTrue(photoBuilderPage.isEntryWithDatePresent(1),"[PROGRESS screen] NO entries with date present");
//
//        photoBuilderPage.tapOnWeightEntry(1);
//        if(!photoBuilderPage.isEntryImage(1)){
//            Assert.assertTrue(photoBuilderPage.isCTAImportPhotoPresent(),"[PHOTOBUILDERPAGE screen] NO CTA 'Import photo for...'  present");
//        }
//        Assert.assertTrue(photoBuilderPage.isNoPhotoEntryHasDate(),"[PHOTOBUILDERPAGE screen] NOt All No-Photo-entries has Date ");
//        photoBuilderPage.selectMode(ModeType.SPLIT);
//
//
//        System.out.println("hi");
//
//    }
//}