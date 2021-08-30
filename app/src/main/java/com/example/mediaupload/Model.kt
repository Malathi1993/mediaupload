package com.example.mediaupload

    class Model{
        var nationalIdentificationNumber:String
        var  nationalIdentificationValidity:String
        var drivingLicenseNumber:String
        var drivingLicenseValidity:String
        constructor(nationalIdentificationNumber: String,nationalIdentificationValidity:String,drivingLicenseNumber:String,drivingLicenseValidity: String) {
            this.nationalIdentificationNumber = nationalIdentificationNumber
            this.nationalIdentificationValidity = nationalIdentificationValidity
            this.drivingLicenseNumber = drivingLicenseNumber
            this.drivingLicenseValidity = drivingLicenseValidity
        }

    }

