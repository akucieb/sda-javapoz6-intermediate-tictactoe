package pl.sda.poznan;

/**
 * Interfejs, ktorego zadaniem bedzie wysylanie odpowiednie wiadomosci na podstawie przyslanej wiadomosci
 */
public interface RequestListener {
    Message onMessageReceived(Message request);
}
