package com.example.jobsterific.data.response

import com.google.gson.annotations.SerializedName

data class GetMyCandidateResponse(

	@field:SerializedName("applyment")
	val applyment: List<ApplymentItem?>? = null
)

data class ApplymentItem(

	@field:SerializedName("applyId")
	val applyId: Int? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("batchId")
	val batchId: Int? = null,

	@field:SerializedName("userId")
	val userId: Int? = null,

	@field:SerializedName("user")
	val user: UserMyCandidate? = null,

	@field:SerializedName("status")
	val status: Boolean? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class UserMyCandidate(

	@field:SerializedName("resume")
	val resume: String? = null,

	@field:SerializedName("lastName")
	val lastName: String? = null,

	@field:SerializedName("website")
	val website: Any? = null,

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("profile")
	val profile: Any? = null,

	@field:SerializedName("sex")
	val sex: String? = null,

	@field:SerializedName("description")
	val description: Any? = null,

	@field:SerializedName("isAdmin")
	val isAdmin: Boolean? = null,

	@field:SerializedName("userId")
	val userId: Int? = null,

	@field:SerializedName("token")
	val token: String? = null,

	@field:SerializedName("firstName")
	val firstName: String? = null,

	@field:SerializedName("isCustomer")
	val isCustomer: Boolean? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("phone")
	val phone: Any? = null,

	@field:SerializedName("predict")
	val predict: Any? = null,

	@field:SerializedName("job")
	val job: String? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)
