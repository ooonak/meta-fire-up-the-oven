SUMMARY = "Another Hello World"
HOMEPAGE = "https://github.com/ooonak/fire-up-the-oven-cmake.git"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI += "git://git@github.com/ooonak/fire-up-the-oven-cmake.git;protocol=https;nobranch=1;branch=main"
SRCREV = "d6bc468451fd49d9cc822504f6abac01903b409a"
S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""
