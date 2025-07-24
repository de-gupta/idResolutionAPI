package ai.eylo.user.resolution.api;

@FunctionalInterface
public interface IdentifierConverter<SourceID, TargetID>
{
	TargetID convert(SourceID id);
}