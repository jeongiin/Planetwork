package com.example.planetwork
package com.example.planetwork

import java.io.*
import java.net.Socket

class SocketClient {

    val ip = 'ip address' // 192.168.0.0
    val port = 3000 // 여기에 port를 입력해주세요

    val socket = Socket('127.0.0.0', 3389) // ip와 port를 입력하여 클라이언트 소켓을 만듭니다.
    val outStream = socket.outputStream // outputStream - 데이터를 내보내는 스트림입니다.
    val inStream = socket.inputStream // inputStream - 데이터를 받는 스트림입니다.

    val data = "여기에 데이터를 입력하세요." // 데이터는 byteArray로 변경 할 수 있어야 합니다.
    outStream.write(data.toByteArray()) // toByteArray() 파라미터로 charset를 설정할 수 있습니다. 기본값 utf-8

    val available = inStream.available() // 데이터가 있으면 데이터의 사이즈 없다면 -1을 반환합니다.
    if (available > 0){
        val dataArr = ByteArray(available) // 사이즈에 맞게 byte array를 만듭니다.
        outStream.read(dataArr) // byte array에 데이터를 씁니다.
        val data = String(dataArr) // byte array의 데이터를 통해 String을 만듭니다.
        println("data : ${data}")
    }
}