package com.example.abc_job_movil.network

import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class NetworkServiceAdapter constructor(context: Context) {

    val instance: RequestQueue = Volley.newRequestQueue(context.applicationContext)

    companion object{
        const val BASE_URL = "http://34.117.27.162/"
        fun getRequest(path:String, responseListener: Response.Listener<String>, errorListener: Response.ErrorListener): StringRequest {
            return StringRequest(Request.Method.GET, BASE_URL+path, responseListener,errorListener)
        }
        fun postRequest(path: String, body: JSONObject, responseListener: Response.Listener<JSONObject>, errorListener: Response.ErrorListener ): JsonObjectRequest {
            return  JsonObjectRequest(Request.Method.POST, BASE_URL+path, body, responseListener, errorListener)
        }
        fun deleteRequest(path: String, body: JSONObject, responseListener: Response.Listener<JSONObject>, errorListener: Response.ErrorListener ): JsonObjectRequest {
            return  JsonObjectRequest(Request.Method.DELETE, BASE_URL+path, body, responseListener, errorListener)
        }
        fun putRequest(path: String, body: JSONObject, responseListener: Response.Listener<JSONObject>, errorListener: Response.ErrorListener ):JsonObjectRequest{
            return  JsonObjectRequest(Request.Method.PUT, BASE_URL+path, body, responseListener, errorListener)
        }

    }

}