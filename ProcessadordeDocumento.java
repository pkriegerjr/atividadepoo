public abstract class ProcessadordeDocumento {

    public final void processar() {
        abrir();
        fechar();
        formatar();
    }
     public void abrir() {
        System.out.println("abrindo documento...");
    }

    public void fechar() {
        System.out.println("fechando documento");
    }

    public abstract void formatar();
}