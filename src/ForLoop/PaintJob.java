package ForLoop;

public class PaintJob {
    public static void main(String[] args) {
        getBucketCount(-3.4, 2.1, 1.5, 2);
        getBucketCount(3.4, 2.1, 1.5, 2);
        getBucketCount(2.75, 3.25, 2.5, 1);
        getBucketCount(-3.4, 2.1, 1.5);
        getBucketCount(3.4, 2.1, 1.5);
        getBucketCount(7.25, 4.3, 2.35);
        getBucketCount(3.4, 1.5);
        getBucketCount(3.4, 1.5);
        getBucketCount(3.26, 0.75);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double areaToPaint = width * height;
            int bucketRequired = (int) Math.ceil(areaToPaint / areaPerBucket) - extraBuckets;
            return bucketRequired;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (areaPerBucket <= 0 || area <= 0) {
            return -1;
        } else {
            int bucketRequired = (int) Math.ceil(area / areaPerBucket);
            return bucketRequired;
        }
    }
}
