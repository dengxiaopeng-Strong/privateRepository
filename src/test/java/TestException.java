import enumClass.ResponseEnum;

public class TestException {
    public static void main(String[] args){
        ResponseEnum.BAD_NOT_TYPE.assertNotNull(133);
    }
}
