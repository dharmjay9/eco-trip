package com.myecotrip.myecotrip.network;

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

import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Use to handle Network Call
 */


public class RestClient implements INetwork {

    ApiCall iNetwork;

    //http://myecotrip.com/myecotrip_api/public/index.php/api/v1/signUp
    public RestClient() {
       // String url = "http://myecotrip.com/myecotrip_api/public/index.php/api/v1/";
       // String url = "http://myecotrip.com/myecotrip_api_new/public/index.php/api/v1/";
        //String url = "http://13.126.3.49:8080/development/myecotripAPIs/public/index.php/";
        String url = "http://35.154.28.131/myecotripapis/public/index.php/";
        Retrofit retrofit = new Retrofit.Builder()
                .client(new OkHttpClient())
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        iNetwork = retrofit.create(ApiCall.class);
    }


    /**
     * Add common parameter in Get API
     *
     * @return
     */
    private OkHttpClient.Builder getOkHttpClient() {

        OkHttpClient.Builder httpClient =
                new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                okhttp3.Request original = chain.request();
                HttpUrl originalHttpUrl = original.url();
                HttpUrl url = originalHttpUrl.newBuilder()
                        .addQueryParameter("userPassword", "Capgeminiapi")
                        .addQueryParameter("accountName", "lakmepilot")
                        .addQueryParameter("appVersion", "v100")
                        .addQueryParameter("userName", "api_capgemini")
                        .build();
                okhttp3.Request.Builder requestBuilder = original.newBuilder()
                        .url(url);

                okhttp3.Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });
        return httpClient;

    }


    @Override
    public void doSignUp(RegisterRequest registerRequest, MyEcoTripCallBack<RegisterResponse> responseMyEcoTripCallBack) {

        Call<RegisterResponse> call=iNetwork.doSignUp(registerRequest);
        call.enqueue(new NetWorkCallBack<>(responseMyEcoTripCallBack));
    }

    @Override
    public void doLogin(LoginRequest registerRequest, MyEcoTripCallBack<LoginResponse> responseMyEcoTripCallBack) {
        Call<LoginResponse> call=iNetwork.doSignIn(registerRequest);
        call.enqueue(new NetWorkCallBack<>(responseMyEcoTripCallBack));
    }

    @Override
    public void getCategory(MyEcoTripCallBack<CategoryRowData> responseMyEcoTripCallBack) {
        Call<CategoryRowData> call=iNetwork.getCategory();
        call.enqueue(new NetWorkCallBack<CategoryRowData>(responseMyEcoTripCallBack));
    }

    @Override
    public void getTrailListing(TrailRequestRowData subCategoryRequest, MyEcoTripCallBack<TrailListingRowData> subCategoryRowDataMyEcoTripCallBack) {
        Call<TrailListingRowData> call=iNetwork.getTrailList(subCategoryRequest);
        call.enqueue(new NetWorkCallBack<TrailListingRowData>(subCategoryRowDataMyEcoTripCallBack));
    }

    @Override
    public void getSubCategory(SubCategoryRequest subCategoryRequest, MyEcoTripCallBack<SubCategoryRowData> subCategoryRowDataMyEcoTripCallBack) {
        Call<SubCategoryRowData> categoryRowDataCall=iNetwork.getSubCategory(subCategoryRequest);
        categoryRowDataCall.enqueue(new NetWorkCallBack<SubCategoryRowData>(subCategoryRowDataMyEcoTripCallBack));
    }

    @Override
    public void getEcoTrailDetails(CommonDetailsRequest commonDetailsRequest, MyEcoTripCallBack<EcoDetailsResponse> subCategoryRowDataMyEcoTripCallBack) {
        Call<EcoDetailsResponse> categoryRowDataCall=iNetwork.getEcoDetailsResponse(commonDetailsRequest);
        categoryRowDataCall.enqueue(new NetWorkCallBack<EcoDetailsResponse>(subCategoryRowDataMyEcoTripCallBack));
    }

    @Override
    public void getBirdSanctury(CommonDetailsRequest commonDetailsRequest, MyEcoTripCallBack<BirdSanacturyResponse> subCategoryRowDataMyEcoTripCallBack) {
        Call<BirdSanacturyResponse> categoryRowDataCall=iNetwork.getBirdSnactury(commonDetailsRequest);
        categoryRowDataCall.enqueue(new NetWorkCallBack<BirdSanacturyResponse>(subCategoryRowDataMyEcoTripCallBack));
    }

    @Override
    public void getWildLifeSafai(CommonDetailsRequest commonDetailsRequest, MyEcoTripCallBack<WildsafariResponse> subCategoryRowDataMyEcoTripCallBack) {
        Call<WildsafariResponse> categoryRowDataCall=iNetwork.getWildLifeSafari(commonDetailsRequest);
        categoryRowDataCall.enqueue(new NetWorkCallBack<WildsafariResponse>(subCategoryRowDataMyEcoTripCallBack));
    }

    @Override
    public void getAvibality(CheckAvailibityRequest availibityRequest, MyEcoTripCallBack<CheckVaibilityResponse> avResponseMyEcoTripCallBack) {
        Call<CheckVaibilityResponse> categoryRowDataCall=iNetwork.chekAvibality(availibityRequest);
        categoryRowDataCall.enqueue(new NetWorkCallBack<>(avResponseMyEcoTripCallBack));
    }

    @Override
    public void getTrailDetails(String id, MyEcoTripCallBack<TrailDetailsResponse> avResponseMyEcoTripCallBack) {
        Call<TrailDetailsResponse> categoryRowDataCall=iNetwork.getTrailDetails(Integer.parseInt(id));
        categoryRowDataCall.enqueue(new NetWorkCallBack<>(avResponseMyEcoTripCallBack));
    }

    @Override
    public void checkVailableSeat(AvailableSeatRuequest availibityRequest, MyEcoTripCallBack<AvailableSeatResponse> avResponseMyEcoTripCallBack) {
        Call<AvailableSeatResponse> categoryRowDataCall=iNetwork.checkAvailableSeat(availibityRequest);
        categoryRowDataCall.enqueue(new NetWorkCallBack<>(avResponseMyEcoTripCallBack));
    }

    @Override
    public void bookTrail(BookingReuest availibityRequest, MyEcoTripCallBack<BookingResponse> avResponseMyEcoTripCallBack) {
        Call<BookingResponse> categoryRowDataCall=iNetwork.bookingTrail(availibityRequest);
        categoryRowDataCall.enqueue(new NetWorkCallBack<>(avResponseMyEcoTripCallBack));
    }


}
