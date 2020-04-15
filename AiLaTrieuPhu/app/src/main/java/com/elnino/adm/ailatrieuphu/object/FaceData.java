package com.elnino.adm.ailatrieuphu.object;

import java.util.ArrayList;
import java.util.Random;

public class FaceData {
    public FaceData (){
        taoCauHoi1();
    }
    public Cauhoi taoCauHoi(int capDo){
        Random r =new Random();
        ArrayList<Cauhoi> arr =arrcauHoi.get(capDo-1);

        return arr.get(r.nextInt(arr.size()));

    }
        ArrayList<ArrayList<Cauhoi>> arrcauHoi = new ArrayList<>();
    public void taoCauHoi1(){
        ArrayList<Cauhoi> arrCauSo1 = new ArrayList<>();
        arrCauSo1.add(taocauhoi("1. Mạnh vì..., bạo vì tiền","Gạo","Khỏe&Thóc&Lúa"));
        arrCauSo1.add(taocauhoi("1. Thức ăn nào sau đây thuộc nhóm thức ăn chứa nhiều tinh bột","Gạo","Cá&Tôm&Gà"));
        arrCauSo1.add(taocauhoi("1. Ngôi chùa được đúc hoàn toàn bằng đồng tại Việt Nam ","Chùa Đồng","Chùa Bái Đính&Chùa Hương&Chùa Hà"));
        arrCauSo1.add(taocauhoi("1. Cây ngay không sợ... ","Đứng","Nằm&Ngồi&Thẳng"));
        arrCauSo1.add(taocauhoi("1. Người đẹp vì lụa, ... tốt vì phân","Lúa","Gạo&Ngô&Khoai"));
        arrcauHoi.add(arrCauSo1);

        ArrayList<Cauhoi> arrCauSo2 = new ArrayList<>();
        arrCauSo2.add(taocauhoi("2. Đơn vị đo dung lượng bộ nhớ nào lớn nhất ","TB","KB&MB&GB"));
        arrCauSo2.add(taocauhoi("2. Chị em dâu như bầu... ","Nước Lã","Nước Suối&Nước Sông&Nước Biển"));
        arrCauSo2.add(taocauhoi("2. Ngọn núi nào cao nhất Nhật Bản  ","Phú Sĩ","Fansipan&Hymalaya&Bà Đen"));
        arrCauSo2.add(taocauhoi("2. Loại vật liệu dùng trong sản xuất thủy tinh ","Cát Trắng","Đất Sét&Đất BaZan&Đất Feralit "));
        arrCauSo2.add(taocauhoi("2. Chị em dâu như bầu... ","Nước Lã","Nước Suối&Nước Sông&Nước Biển"));
        arrcauHoi.add(arrCauSo2);

        ArrayList<Cauhoi> arrCauSo3 = new ArrayList<>();
        arrCauSo3.add(taocauhoi("3. Liên đoàn bóng đá Úc thuộc liên đoàn bóng đá nào ","Châu Á","Châu Âu&Châu Mỹ&Châu Phi"));
        arrCauSo3.add(taocauhoi("3. Đội bóng đã từng đoạt nhiều chức vô địch Copa America nhất ","Uruguay","Brazil&Achentina&Parguay"));
        arrCauSo3.add(taocauhoi("3. Cầu thủ nào có biệt danh là Tóc đuôi ngựa thần thánh ","Roberto Baggio","Luigi Di Biagio&Salvatore Schillaci&Lionel Messei"));
        arrCauSo3.add(taocauhoi("3. Quốc gia nào đăng cai World Cup 2018 ","Nga","Pháp&Mỹ&Anh"));
        arrCauSo3.add(taocauhoi("3. Ai là người thực hiện quả phạt gián tiếp giúp Công Vinh ghi bàn thắng quan trọng giúp Việt Nam vô địch AFF Cup 2008 ","Minh Phương","Tài Em&Dương Hồng Sơn&Việt Thắng"));
        arrcauHoi.add(arrCauSo3);
        ArrayList<Cauhoi> arrCauSo4 = new ArrayList<>();
        arrCauSo4.add(taocauhoi("4. Quạ... thì ráo, sáo... thì mưa","Tắm","Phơi&Nằm&Đứng"));
        arrCauSo4.add(taocauhoi("4. Tim người gồm bao nhiêu ngăn?","4","3&2&1"));
        arrCauSo4.add(taocauhoi("4. Thăng Long Hà Nội 1000 tuổi vào năm nào","2010","2011&2012&2013"));
        arrCauSo4.add(taocauhoi("4. Nước lã mà... nên hồ","Vã","Ngã&Vỗ&Tát"));
        arrCauSo4.add(taocauhoi("4. Phương tiện nào sau đây ít giống với những cái còn lại","Máy Bay","Ô tô&Xe Máy&Xe Đạp"));
        arrcauHoi.add(arrCauSo4);
        ArrayList<Cauhoi> arrCauSo5 = new ArrayList<>();
        arrCauSo5.add(taocauhoi("5. Một chốn... quê","Đôi","Ba&Bốn&Năm"));
        arrCauSo5.add(taocauhoi("5. Sat trong tiếng Anh là thứ mấy trong tuần","Thứ 7","Thứ 2&Thứ 3&Chủ Nhật"));
        arrCauSo5.add(taocauhoi("5. Trong các số do dưới đây, số đo nào bằng 25,08 km","25080m","25008m&25800m&258m"));
        arrCauSo5.add(taocauhoi("5. Người ta thường gọi quốc gia nào là đất nước mặt trời mọc","Nhật Bản","Úc&Mỹ&Nga"));
        arrCauSo5.add(taocauhoi("5. Con có cha như nhà có...","Nóc","Đầu&Mái&Cổng"));
        arrcauHoi.add(arrCauSo5);
        ArrayList<Cauhoi> arrCauSo6 = new ArrayList<>();
        arrCauSo6.add(taocauhoi("6. Điền từ còn thiếu vào câu thành ngữ sau: Vắng chủ nhà, gà...","Vọc Niêu Tôm","Mọc Đuôi Tôm&Ăn Trôm Tôm&Mổ Chết Tôm"));
        arrCauSo6.add(taocauhoi("6. Loại củ nào giúp vết thương mau lành, không để lại sẹo","Nghệ","Hành&Giềng&Tỏi"));
        arrCauSo6.add(taocauhoi("6. World Cup 2022 sẽ được tổ chức ở quốc gia nào","Quatar","Pháp&Hà Lan&Italia"));
        arrCauSo6.add(taocauhoi("6. Theo một câu ca dao xưa thì \"Một chục quả hồng nuốt…\" ai","Lão Tám Mươi","Lão Chín Mươi&Lão Bảy Mươi&Lão Sáu Mươi"));
        arrCauSo6.add(taocauhoi("6. \"El Nino\" là gì?","Hiện Tượng Thời Tiết","Món Ăn&Địa Danh&Loại Cây"));
        arrcauHoi.add(arrCauSo6);
        ArrayList<Cauhoi> arrCauSo7 = new ArrayList<>();
        arrCauSo7.add(taocauhoi("7. Nòng nọc xuất hiện trong vòng đời của loài vật nào","Ếch","Rắn&Lươn&Cá"));
        arrCauSo7.add(taocauhoi("7. \"Lão Hạc\" là truyện ngắn của tác giả nào","Nam Cao","Kim Lân&Thạch Lam&Xuân Diệu"));
        arrCauSo7.add(taocauhoi("7. Ngày chủ nhật của tuần thứ 3 tháng 6 hằng năm là ngày gì","Ngày Của Cha","Ngày Của Mẹ&Ngày Của Con&Ngày Của Gia Đình"));
        arrCauSo7.add(taocauhoi("7. Sông Bến Hải nằm ở tỉnh nào","Quảng Trị","Quảng Ngãi&Quảng Nam&Quảng Ninh"));
        arrCauSo7.add(taocauhoi("7. Đại Ngu là quốc hiệu nước ta vào triều đại nào","Nhà Hồ","Nhà Nguyễn&Nhà Lê&Nhà Trần"));
        arrcauHoi.add(arrCauSo7);
        ArrayList<Cauhoi> arrCauSo8 = new ArrayList<>();
        arrCauSo8.add(taocauhoi("8. Mưa ngâu là vào khoảng tháng mấy âm lịch trong năm","7","4&3&2"));
        arrCauSo8.add(taocauhoi("8. Pha màu đỏ với màu xanh lam, ta được màu nào sau đây","Tím","Đỏ&Xanh&Đen"));
        arrCauSo8.add(taocauhoi("8. Ngày sinh của Phật Thích Ca mâu Ni còn được gọi là ngày gì","Phật Đản","Phật Pháp&Phật Tử&Phật Giáo"));
        arrCauSo8.add(taocauhoi("8. Trong truyện Kiều, khi gặp Thúy Kiều lần đầu tiên, Kim Trọng cưỡi ngựa gì","Ngựa Bạch","Ngựa Ô&Xích Thố&Ngựa Vằn"));
        arrCauSo8.add(taocauhoi("8. Phủ Tây Hồ ở Hà Nội ngày nay thờ ai","Mẫu Liễu Hạnh","Thánh Gióng&Trần Hưng Đạo&Chử Đồng Tử"));
        arrcauHoi.add(arrCauSo8);
        ArrayList<Cauhoi> arrCauSo9 = new ArrayList<>();
        arrCauSo9.add(taocauhoi("9. GRU là tên viết tắt cơ quan nào của Nga","Cơ Quan Tình Báo","Bộ Quốc Phòng&Quốc Hội&Bộ Nội Vụ"));
        arrCauSo9.add(taocauhoi("9. Thành vạn An do ai xây dựng","Mai Hắc Đế","Lý Nam Đế&Lê Lợi&Trần Hưng Đạo"));
        arrCauSo9.add(taocauhoi("9. Nước nào sau đây nằm trên quần đảo Mã Lai","Indonesia","Việt Nam&Singapore&Thái Lan"));
        arrCauSo9.add(taocauhoi("9. Nước nào là quê hương của Ông Già Tuyết","Phần Lan","Hà Lan&Canada&Nga"));
        arrCauSo9.add(taocauhoi("9. Phim hoạt hình đầu tiên được công chiếu vào thời gian nào ","28-10-1892","28-10-1893&28-10-1894&28-10-1891"));
        arrcauHoi.add(arrCauSo9);
        arrcauHoi.add(arrCauSo2);
        arrcauHoi.add(arrCauSo3);
        arrcauHoi.add(arrCauSo5);
        arrcauHoi.add(arrCauSo6);
        arrcauHoi.add(arrCauSo1);
        arrcauHoi.add(arrCauSo7);
        arrcauHoi.add(arrCauSo2);
    }
    private Cauhoi taocauhoi(String s1,String s2,String s3){
        Cauhoi c1 = new Cauhoi();
        c1.setNoiDung(s1);
        c1.setDapAnDung(s2);
        c1.setArrDapAnSai(s3);
        return c1;
    }
}
