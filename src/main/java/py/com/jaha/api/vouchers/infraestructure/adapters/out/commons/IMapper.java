package py.com.jaha.api.vouchers.infraestructure.adapters.out.commons;

import java.util.List;

public interface IMapper<D, E> {

  D toDomain(E entity);

  E toEntity(D domain);

  List<D> toDomainList(List<E> entities);

  List<E> toEntityList(List<D> domains);
}
