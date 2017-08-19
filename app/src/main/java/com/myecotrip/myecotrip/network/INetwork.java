package com.myecotrip.myecotrip.network;


import android.app.VoiceInteractor;

import com.myecotrip.myecotrip.booking.rowData.AvailableSeatResponse;
import com.myecotrip.myecotrip.booking.rowData.AvailableSeatRuequest;
import com.myecotrip.myecotrip.booking.rowData.BookingResponse;
import com.myecotrip.myecotrip.booking.rowData.BookingReuest;
import com.myecotrip.myecotrip.booking.rowData.CheckAvailibityRequest;
import com.myecotrip.myecotrip.booking.rowData.CheckVaibilityResponse;
import com.myecotrip.myecotrip.details.CommonDetailsRequest;
import com.myecotrip.myecotrip.details.birdSanactury.BirdSanacturyResponse;
import com.myecotrip.myecotrip.details.ecoTrail.EcoDetailsResponse;
import com.myecotrip.myecotrip.details.ecoTrail.TrailDetailsResponse;
import com.myecotrip.myecotrip.details.ecoTrail.TrailListingRowData;
import com.myecotrip.myecotrip.details.ecoTrail.TrailRequestRowData;
import com.myecotrip.myecotrip.details.wildSafari.WildsafariResponse;
import com.myecotrip.myecotrip.home.fargmentHome.CategoryRowData;
import com.myecotrip.myecotrip.listing.newListing.SubCategoryRequest;
import com.myecotrip.myecotrip.listing.newListing.SubCategoryRowData;
import com.myecotrip.myecotrip.login.LoginRequest;
import com.myecotrip.myecotrip.login.LoginResponse;
import com.myecotrip.myecotrip.register.RegisterRequest;
import com.myecotrip.myecotrip.register.RegisterResponse;

public interface INetwork {

    void doSignUp(RegisterRequest registerRequest, MyEcoTripCallBack<RegisterResponse> responseMyEcoTripCallBack);
    void doLogin(LoginRequest registerRequest, MyEcoTripCallBack<LoginResponse> responseMyEcoTripCallBack);
    void getCategory(MyEcoTripCallBack<CategoryRowData> responseMyEcoTripCallBack);
    void getTrailListing(TrailRequestRowData subCategoryRequest, MyEcoTripCallBack<TrailListingRowData> subCategoryRowDataMyEcoTripCallBack);
    void getSubCategory(SubCategoryRequest subCategoryRequest,MyEcoTripCallBack<SubCategoryRowData> subCategoryRowDataMyEcoTripCallBack);
    void getEcoTrailDetails(CommonDetailsRequest commonDetailsRequest, MyEcoTripCallBack<EcoDetailsResponse> subCategoryRowDataMyEcoTripCallBack);
    void getBirdSanctury(CommonDetailsRequest commonDetailsRequest, MyEcoTripCallBack<BirdSanacturyResponse> subCategoryRowDataMyEcoTripCallBack);
    void getWildLifeSafai(CommonDetailsRequest commonDetailsRequest, MyEcoTripCallBack<WildsafariResponse> subCategoryRowDataMyEcoTripCallBack);
    void getAvibality(CheckAvailibityRequest availibityRequest, MyEcoTripCallBack<CheckVaibilityResponse> avResponseMyEcoTripCallBack);
    void getTrailDetails(String id, MyEcoTripCallBack<TrailDetailsResponse> avResponseMyEcoTripCallBack);
    void checkVailableSeat(AvailableSeatRuequest availibityRequest, MyEcoTripCallBack<AvailableSeatResponse> avResponseMyEcoTripCallBack);
    void bookTrail(BookingReuest availibityRequest, MyEcoTripCallBack<BookingResponse> avResponseMyEcoTripCallBack);


}