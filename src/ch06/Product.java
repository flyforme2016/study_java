package ch06;

public class Product {
	String productName = "";
	Integer productNumber = 0;
	Integer categoryCd = 0;        //대분류
	Integer detailCategoryCd = 0;  //소분류
	Integer purchasePrice = 0;     //매입가
	Integer price = 0;				//판매가
	Integer stock = 0;			 //제고량
	Integer soldOutNy = 0;
	Integer discountNy = 0;
	Integer discountPrice = 0;
	//해쉬 태그는 파생테이블
	//색상, 사이즈는 각각 파생테이블
	//제품 이미지는 파생테이블
}
