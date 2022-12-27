package lat.pam.mypizza.api;

import java.util.List;

import lat.pam.mypizza.model.ProductModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonApi {

    @GET("uasresto")
    Call<List<ProductModel>> getProduct();
}
