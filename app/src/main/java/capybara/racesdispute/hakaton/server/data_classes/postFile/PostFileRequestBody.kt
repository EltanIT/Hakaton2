package capybara.racesdispute.hakaton.server.data_classes.postFile

import java.io.FileInputStream

data class PostFileRequestBody(
    val file: FileInputStream,
)
