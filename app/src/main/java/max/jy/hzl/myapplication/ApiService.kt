package max.jy.hzl.myapplication

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService{

    @GET("api/data/%E7%A6%8F%E5%88%A9/20/1")
    fun getNetData() : Observable<BelleBean>

}