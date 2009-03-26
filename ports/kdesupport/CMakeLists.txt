project(KDESupport)
cmake_minimum_required(VERSION 2.4.5 FATAL_ERROR)

enable_testing()
set(CMAKE_INCLUDE_CURRENT_DIR ON)

include(MacroOptionalAddSubdirectory.cmake)

# We no longer recommend building QCA as part of "everything in kdesupport"
# Instead, use a package from your distribution (or build from packaged
# source: http://delta.affinix.com/qca/)
# You can, of course, build QCA from SVN to hack on it. In that case,
# use kdesupport/qca as the source for cmake, or just uncomment the next
# line.
#macro_optional_add_subdirectory(qca)

# this one is not optional, because otherwise other projects in kdesupport 
# which use automoc break, Alex
add_subdirectory(automoc)

#macro_optional_add_subdirectory(akonadi)
#macro_optional_add_subdirectory(eigen)
#macro_optional_add_subdirectory(eigen2)
macro_optional_add_subdirectory(taglib)
#macro_optional_add_subdirectory(soprano)
#macro_optional_add_subdirectory(strigi)
#macro_optional_add_subdirectory(qimageblitz)
macro_optional_add_subdirectory(phonon)
#macro_optional_add_subdirectory(cpptoxml)
if (WIN32)
#   add_subdirectory(kdewin32)
endif (WIN32)
