import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class CriaBanco extends SQLiteOpenHelper {
    private static final String ID = "id";
    private static final String TABELA = "eventos";
    private static final String NOME_BANCO = "bancodocalendario.db";
    private static final String HORA = "hora";
    private static final String MINUTO = "minuto";
    private static final String DIA = "dia";
    private static final String MES = "mes";
    private static final String ANO = "ano";
    private static final String NOMEVENTO = "nomevento";
    private static final String DESCEVENTO = "descricaoevento";
    private static final int VERSAO = 1;

    public CriaBanco(Context context){
        super(context, NOME_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE"+TABELA+"("
                + ID + "integer primary key autoincrement,"
                + NOMEVENTO + "text,"
                + DESCEVENTO + "text,"
                + DIA + "%d,"
                + MES + ""
                + ANO + ""
                + HORA + ""
                + MINUTO + ""
                + DIA + ""
                +")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABELA);
        onCreate(db);
    }
}