package com.myecotrip.myecotrip.network;


import com.myecotrip.myecotrip.base.CommonModel;
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

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

interface ApiCall {

    @POST("userSignUp")
    Call<RegisterResponse> doSignUp(@Body RegisterRequest registerRequest);

    @POST("userSignIn")
    Call<LoginResponse> doSignIn(@Body LoginRequest registerRequest);

    @GET("categories")
    Call<CategoryRowData> getCategory();

    @POST("subCategories")
    Call<SubCategoryRowData> getSubCategory(@Body SubCategoryRequest subCategoryRequest);

    @POST("ecotrailCamp")
    Call<EcoDetailsResponse> getEcoDetailsResponse(@Body CommonDetailsRequest commonDetailsRequest);

    @POST("trailList")
    Call<TrailListingRowData> getTrailList(@Body TrailRequestRowData commonDetailsRequest);

    @POST("birdSanctuary")
    Call<BirdSanacturyResponse> getBirdSnactury(@Body CommonDetailsRequest commonDetailsRequest);

    @POST("safari")
    Call<WildsafariResponse> getWildLifeSafari(@Body CommonDetailsRequest commonDetailsRequest);

    @POST("bookEcotrailStatus")
    Call<CheckVaibilityResponse> chekAvibality(@Body CheckAvailibityRequest commonDetailsRequest);

    @GET("trailDetail/{id}")
    Call<TrailDetailsResponse> getTrailDetails(@Path("id") int bookId);
    @POST("checkAvailability")
    Call<AvailableSeatResponse> checkAvailableSeat(@Body AvailableSeatRuequest availableSeatRuequest);
    @POST("initiateBooking")
    Call<BookingResponse> bookingTrail(@Body BookingReuest availableSeatRuequest);


}
