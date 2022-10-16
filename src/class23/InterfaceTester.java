package class23;

public class InterfaceTester {
    public static void main(String[] args) {
        IDataBase iDataBase=new IBM();
        iDataBase.openDatabase();
        iDataBase.readData();
        iDataBase.writeData();

        //1:40

    }
}
