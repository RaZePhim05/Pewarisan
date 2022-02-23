public class Ujidata{
    public static void main(String[] args) {
        ID id= new ID();
        Profesi prof= new Profesi();
        Gaji gaji= new Gaji();
        NoPeg no= new NoPeg();
        Data data= new Data();

        id.idPegawai();
        no.cetak();
        data.noPegawai(333333);
        prof.idPegawai();
        gaji.gaji(1200000);
        gaji.gaji(1200000, 1200000);

    }
}
