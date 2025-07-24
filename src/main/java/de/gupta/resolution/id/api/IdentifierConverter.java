package de.gupta.resolution.id.api;

@FunctionalInterface
public interface IdentifierConverter<SourceID, TargetID>
{
	TargetID convert(SourceID id);
}