package com.ameda.kevin.awsimageupload.buckets;

public enum BucketName {
    PROFILE_IMAGE("amedakevin-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
