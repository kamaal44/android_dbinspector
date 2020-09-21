package im.dino.dbinspector.domain.pragma.models

enum class ForeignKeyListColumns {
    ID,
    SEQ,
    TABLE,
    FROM,
    TO,
    ON_UPDATE,
    ON_DELETE,
    MATCH;

    companion object {

        operator fun invoke(index: Int) = values().single { it.ordinal == index }
    }
}