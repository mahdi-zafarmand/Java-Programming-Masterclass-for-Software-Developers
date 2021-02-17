
public class PaintJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(7.25, 4.3, 2.35));
	}
	
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
			return -1;
		}
		int requiredBuckets = (int) Math.ceil(width * height / areaPerBucket);
		return requiredBuckets - extraBucket;
	}
	
	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		int requiredBuckets = (int) Math.ceil(width * height / areaPerBucket);
		return requiredBuckets;
	}

	public static int getBucketCount(double area, double areaPerBucket) {
		if (area <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		int requiredBuckets = (int) Math.ceil(area / areaPerBucket);
		return requiredBuckets;
	}
}
