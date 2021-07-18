package multimodule.domain;

public class LibraryMapper {
    public Library fromDTO(LibraryDTO libraryDTO) {
        Library library = new Library();
        library.setId(libraryDTO.getId());
        library.setNombre(libraryDTO.getNombre());
        library.setTipo(libraryDTO.getTipo());
        return library;
    }

    public LibraryDTO fromModel(Library library) {
        LibraryDTO libraryDTO = new LibraryDTO();
        libraryDTO.setId(library.getId());
        libraryDTO.setNombre(library.getNombre());
        libraryDTO.setTipo(library.getTipo());
        return libraryDTO;
    }
}
