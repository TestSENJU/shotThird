package VO;
/**
 * 
 * @author wyt
 * 0助攻率
 * 1盖帽率
 * 2防守篮板率
 * 3失误率
 * 4使用率
 * 5GmSc效率值
 * 6进攻篮板率
 * 7真实命中率
 * 8篮板率
 * 9投篮效率
 * 10抢断率
 *
 */
public class PlayerHighAllVO {
String name;
String id;
double data[]=new double[11];
public PlayerHighAllVO(String s){
	this.id=s;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public double[] getData() {
	return data;
}
public void setData(double[] data) {
	this.data = data;
}


}
