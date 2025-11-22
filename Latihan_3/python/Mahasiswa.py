class Mahasiswa:
    def __init__(self):
        self.__nama = ""
        self.__nim = ""
    def get_nama(self):
        return self.__nama
    def get_nim(self):
        return self.__nim
    def set_nama(self,nama):
        self.__nama = nama
    def set_nim(self,nim):
        if nim.isdigit() and len(nim) == 10:
            self.__nim = nim
        else:
            print("NIM TIDAK VALID")


mhs = Mahasiswa()
mhs.set_nama("Robby")
mhs.set_nim("1212121212")

print("Nama:", mhs.get_nama())
print("NIM:", mhs.get_nim())
    